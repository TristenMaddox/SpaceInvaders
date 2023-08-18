public class Mower {
        private int bladeLength;
        private int bedSize;
        public Mower(int newBladeLength, int newBedSize) {
            bladeLength = newBladeLength;
            bedSize = newBedSize;
        }
        public int getBladeLength() {

            return bladeLength;
        }
        public void setBladeLength(int myBladeLength) {

            bladeLength = myBladeLength;
        }
        public int getBedSize(){
            return bedSize;
        }
        public void setBedSize(int myBedSize){
            bedSize = myBedSize;
        }
    }


