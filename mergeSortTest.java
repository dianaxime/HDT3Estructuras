package com.company;

import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class mergeSortTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(mergeSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
