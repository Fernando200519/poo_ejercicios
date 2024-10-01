class Circle{

    double radius;

    Circle(){
        radius = 1;
    }

    Circle(double _radius){
        radius = _radius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double _radius){
        radius = _radius;
    }
}