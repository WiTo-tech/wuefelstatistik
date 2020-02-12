package de.gbsschulen.wuefelstatistik;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class WuerfelTest {
    private IWuerfel wuerfel;
    @BeforeEach
    private void init(){
        wuerfel = new Wuerfel();
    }
    @Test
    public void wuerfelShouldBeBetween1and6(){

        int result = wuerfel.getWurf();
        assertThat(result).isBetween(1,6);
    }
}
