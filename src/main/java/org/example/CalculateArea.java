package org.example;

public class CalculateArea {

        public static double calculateArea(ShapeType shapeType, double... parameters) {
            switch (shapeType) {
                case RECTANGLE:
                    if (parameters.length != 2) {
                        throw new RuntimeException("Rectangle requires 2 parameters: width and height.");
                    }
                    return parameters[0] * parameters[1];
                case SQUARE:
                    if (parameters.length != 1) {
                        throw new RuntimeException("Square requires 1 parameter: side length.");
                    }
                    return Math.pow(parameters[0], 2);
                case CIRCLE:
                    if (parameters.length != 1) {
                        throw new RuntimeException("Circle requires 1 parameter: radius.");
                    }
                    return Math.PI * Math.pow(parameters[0], 2);
                default:
                    throw new RuntimeException("Invalid shape type.");
            }
        }

    }


