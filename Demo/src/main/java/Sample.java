import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Sample {
private static final Logger logger=LogManager.getLogger(Sample.class);

public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
    logger.info("hello");
    logger.debug("Im sampath");
    logger.fatal("sasas");
    logger.error("Error");
	
}
}
