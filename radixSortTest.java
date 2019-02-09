package com.company;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class radixSortTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(radixSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
