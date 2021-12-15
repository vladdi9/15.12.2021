package org.itstep;

public class Main {
    public static void main(String[] args) {
        Builder nifNif = new NifNif();
        Builder nafNaf = new NafNaf();
        Builder nufNuf = new NufNuf();
        Director director = new Director();
        director.setBuilder(nifNif);
        director.setBuilder(nafNaf);
        director.setBuilder(nufNuf);
        nafNaf.buildRoof();
    }
}

    interface Builder {
        public abstract void buildBase();

        public abstract void buildWalls();

        public abstract void buildRoof();
    }

    class NifNif implements Builder {
        @Override
        public void buildBase() {
            System.out.println("I build the soil base");
        }

        @Override
        public void buildWalls() {
            System.out.println("I build the clay walls");
        }

        @Override
        public void buildRoof() {
            System.out.println("I build the straw roof");
        }
    }

    class NafNaf implements Builder {
        @Override
        public void buildBase() {
            System.out.println("I build the sand base");
        }

        @Override
        public void buildWalls() {
            System.out.println("I build the sticks walls");
        }

        @Override
        public void buildRoof() {
            System.out.println("I build the leaves roof");
        }
    }

    class NufNuf implements Builder {
        @Override
        public void buildBase() {
            System.out.println("I build the concrete base");
        }

        @Override
        public void buildWalls() {
            System.out.println("I build the bricks walls");
        }

        @Override
        public void buildRoof() {
            System.out.println("I build the tile roof");
        }
    }

    class Director {
        private Builder builder;

        public void setBuilder(Builder builder) {
            this.builder = builder;
        }

        public void buildHouse() {
            builder.buildBase();
            builder.buildWalls();
            builder.buildRoof();
        }

        public void buildBass(){
            builder.buildBase();
        }
        public void buildWalls(){
            builder.buildWalls();
        }
        public void buildRoof(){
            builder.buildRoof();
        }
    }
