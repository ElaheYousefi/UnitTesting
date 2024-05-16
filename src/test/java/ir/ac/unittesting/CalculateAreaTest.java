package ir.ac.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CalculateAreaTest {

    @Mock
    CircleService circleService;
    @Mock
    RectangleService rectangleService;
    @Mock
    SquareService squareService;
    @InjectMocks
    CalculateArea calculateArea;

    @Test
    void getArea() {
        Mockito.when(rectangleService.getArea(5.0d, 4.0d)).thenReturn(20d);
        Double calculatedArea= this.calculateArea.getArea("rectangle", 5.0d, 4.0d);
        assertThat(calculatedArea).isEqualTo(20d);
    }
}