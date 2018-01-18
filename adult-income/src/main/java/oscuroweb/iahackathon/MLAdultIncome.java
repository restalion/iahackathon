package oscuroweb.iahackathon;


import org.apache.hive.com.esotericsoftware.minlog.Log;
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
        	
        	Log.error("[ERROR] RuntimeException: There must be at least one argument (a file name or directory)");
        	throw new RuntimeException();
        }
        
		Dataset<Row> dataset = spark.read().csv(args[0]);
		dataset.show();
		

	}

}
