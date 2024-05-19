package ir.ac.unittesting;


import org.springframework.stereotype.Service;

@Service
public class CircleService {

    public Double getArea(double r){
        log();
        return 3.14E00 * r* r;
    }
    public void log(){
        System.out.println("circle logging");
    }
}
