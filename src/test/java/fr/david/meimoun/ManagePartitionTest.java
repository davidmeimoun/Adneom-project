package fr.david.meimoun;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ManagePartitionTest {

    @Test
    public void goodPartitionWithTwoListReturn(){
        List<List<Integer>> listResult = ManagePartition.Partition(Arrays.asList(1,2,3,4,5),2);
        List<List<Integer>> listExpected = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5));
        Assert.assertArrayEquals(listResult.toArray(),listExpected.toArray());
    }

    @Test
    public void goodPartitionWithThreeListReturn(){
        List<List<Integer>> listResult = ManagePartition.Partition(Arrays.asList(1,2,3,4,5),3);
        List<List<Integer>> listExpected = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5));
        Assert.assertArrayEquals(listResult.toArray(),listExpected.toArray());
    }

    @Test
    public void goodPartitionWithOneListReturn(){
        List<List<Integer>> listResult = ManagePartition.Partition(Arrays.asList(1,2,3,4,5),1);
        List<List<Integer>> listExpected = Arrays.asList(Arrays.asList(1),Arrays.asList(2),Arrays.asList(3),Arrays.asList(4),Arrays.asList(5));
        Assert.assertArrayEquals(listResult.toArray(),listExpected.toArray());
    }

    @Test
    public void DesorderListTest(){
        List<List<Integer>> listResult = ManagePartition.Partition(Arrays.asList(10,5,2,7,4),2);
        List<List<Integer>> listExpected = Arrays.asList(Arrays.asList(10,5),Arrays.asList(2,7),Arrays.asList(4));
        Assert.assertNotEquals(listResult.toArray(),listExpected.toArray());
    }

    @Test
    public void NullListTest(){
        List<List<Integer>> listResult = ManagePartition.Partition(null,2);
        List<List<Integer>> listExpected = Arrays.asList();
        Assert.assertArrayEquals(listResult.toArray(),listExpected.toArray());
    }



}
