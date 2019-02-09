package com.company;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class gnomeSortTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(gnomeSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
