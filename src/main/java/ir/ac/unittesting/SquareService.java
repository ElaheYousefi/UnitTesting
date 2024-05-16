package ir.ac.unittesting;

import org.springframework.stereotype.Service;

@Service
public class SquareService {

    public Double getArea(double r){
        return r* r;
    }
}
