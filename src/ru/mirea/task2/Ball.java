package ru.mirea.task2;


public class Ball {
        private double radius;
        private String color;

        public Ball(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public Ball(double radius) {
            this.radius = radius;
            this.color = "null";
        }

        public Ball(String color) {
            this.radius = 0;
            this.color = color;
        }

        public Ball(){
            this.radius = 0;
            this.color = "null";
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Ball {radius = " + radius + "; color = " + this.color + "}";
        }
}

