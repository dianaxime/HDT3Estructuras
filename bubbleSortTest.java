package com.company;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class bubbleSortTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(bubbleSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
}