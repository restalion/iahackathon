package oscuroweb.iahackathon;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.ml.feature.StringIndexer;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MLAdultIncome {

	public static final void main(String[] args) {

		SparkSession spark = SparkSession.builder().appName("MLAdultIncome").getOrCreate();

		// Validate arguments list. File name or directory is required
		if (args.length < 1) {

			log.error("[ERROR] RuntimeException: There must be at least one argument (a file name or directory)");
			throw new RuntimeException();
		}

		Dataset<Row> dataset = spark.read().csv(args[0]);
		dataset.show();

		// Transform string columns to integer
		List<StringIndexer> indexes = new ArrayList<StringIndexer>();
		indexes.add(new StringIndexer().setInputCol("_c1").setOutputCol("_c1_index"));
		indexes.add(new StringIndexer().setInputCol("_c3").setOutputCol("_c3_index"));
		indexes.add(new StringIndexer().setInputCol("_c5").setOutputCol("_c5_index"));
		indexes.add(new StringIndexer().setInputCol("_c6").setOutputCol("_c6_index"));
		indexes.add(new StringIndexer().setInputCol("_c7").setOutputCol("_c7_index"));
		indexes.add(new StringIndexer().setInputCol("_c8").setOutputCol("_c8_index"));
		indexes.add(new StringIndexer().setInputCol("_c9").setOutputCol("_c9_index"));
		indexes.add(new StringIndexer().setInputCol("_c13").setOutputCol("_c13_index"));
		indexes.add(new StringIndexer().setInputCol("_c14").setOutputCol("_c14_index"));

		for (StringIndexer stringIndexer : indexes) {
			dataset = stringIndexer.fit(dataset).transform(dataset);
		}

		dataset = dataset.drop(dataset.col("_c1")).drop(dataset.col("_c3")).drop(dataset.col("_c5")).drop(dataset.col("_c6"))
				.drop(dataset.col("_c7")).drop(dataset.col("_c8")).drop(dataset.col("_c9")).drop(dataset.col("_c13"))
				.drop(dataset.col("_c14"));

		dataset.show();

	}

}
