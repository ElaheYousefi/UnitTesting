package ir.ac.unittesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculateArea {

    CircleService circleService;
    SquareService squareService;
    RectangleService rectangleService;

    CalculateArea(@Autowired CircleService circleService, @Autowired SquareService squareService, @Autowired
            RectangleService rectangleService){
        this.circleService= circleService;
        this.squareService= squareService;
        this.rectangleService= rectangleService;
    }

    public Double getArea(String type, double r, double d){

        switch (type){
            case "circle":
                return circleService.getArea(r);
            case "square":
                return squareService.getArea(r);
            case "rectangle":
                return rectangleService.getArea(r, d);
        }
        return 0D;
    }
}
