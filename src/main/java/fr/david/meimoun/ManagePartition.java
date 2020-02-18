package fr.david.meimoun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class ManagePartition {

    private static Logger logger = Logger.getLogger(ManagePartition.class);

    //method works only if input list contains order number
    public static List<List<Integer>> Partition(List<Integer> inputList, int sizeOfOutput) {

        if(InputListIsNotNull(inputList) && SizeOfOutputIsCorrect(sizeOfOutput)){
            logger.info("Begin Partition with "+inputList.toString() + " and sizeOfOutput " + sizeOfOutput);


            List<List<Integer>> result =  new ArrayList<>(inputList.stream().collect(Collectors.groupingBy(x -> (x-1) / sizeOfOutput )).values());

            logger.info("Return Partition with "+ result);
            return result;
        }
        else{
            logger.error("Error with arguments");
            return Arrays.asList();
        }


    }

    private static boolean InputListIsNotNull(List<Integer> inputList){
        return inputList != null;
    }

    private static boolean SizeOfOutputIsCorrect(int sizeOfOutput){
        return sizeOfOutput >= 1 ;
    }

}
