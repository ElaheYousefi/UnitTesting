package ir.ac.unittesting;

import org.springframework.stereotype.Service;

@Service
public class RectangleService {

    public Double getArea(double r, double p){
        return r* p* 2;
    }
}
