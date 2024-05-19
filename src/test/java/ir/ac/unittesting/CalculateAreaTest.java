package ir.ac.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CalculateAreaTest {

    @Spy
    CircleService circleService;
    @Mock
    RectangleService rectangleService;
    @Mock
    SquareService squareService;
    @InjectMocks
    CalculateArea calculateArea;

    @Test
    void getRectangleArea() {
        Mockito.when(rectangleService.getArea(5.0d, 4.0d)).thenReturn(20d);
        Double calculatedArea= this.calculateArea.getArea("rectangle", 5.0d, 4.0d);
        assertThat(calculatedArea).isEqualTo(20d);
    }

    @Test
    void getCircleArea() {
        Mockito.doCallRealMethod().when(circleService).log();
        Mockito.when(circleService.getArea( 4.0d)).thenReturn(50.24d);
        Double calculatedArea= this.calculateArea.getArea("circle",4.0d, 0);
        assertThat(calculatedArea).isEqualTo(50.24d);
    }
}