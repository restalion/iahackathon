package oscuroweb.iahackathon.demo_one;

//$example on$
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.apache.spark.ml.linalg.VectorUDT;
import org.apache.spark.ml.linalg.Vectors;
import org.apache.spark.ml.stat.Correlation;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class CorrelationJava {

    private static final Logger log = Logger.getLogger(CorrelationJava.class.getName());

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder().appName("JavaCorrelationExample").getOrCreate();

        List<Row> data = Arrays.asList(
                RowFactory.create(Vectors.sparse(4, new int[] { 0, 3 }, new double[] { 1.0, -2.0 })),
                RowFactory.create(Vectors.dense(4.0, 5.0, 0.0, 3.0)),
                RowFactory.create(Vectors.dense(6.0, 7.0, 0.0, 8.0)),
                RowFactory.create(Vectors.sparse(4, new int[] { 0, 3 }, new double[] { 9.0, 1.0 })));

        StructType schema = new StructType(
                new StructField[] { new StructField("features", new VectorUDT(), false, Metadata.empty()), });

        Dataset<Row> df = spark.createDataFrame(data, schema);
        Row r1 = Correlation.corr(df, "features").head();
        log.info("Pearson correlation matrix:\n" + r1.get(0).toString());

        Row r2 = Correlation.corr(df, "features", "spearman").head();
        log.info("Spearman correlation matrix:\n" + r2.get(0).toString());

        spark.stop();

    }
}