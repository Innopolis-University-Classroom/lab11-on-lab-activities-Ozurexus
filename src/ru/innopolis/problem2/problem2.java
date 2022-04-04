class ChargerStation{
       void chargeByLightning(LightningPort P){

       }
    }
    class iPhone implements LightningPort{
        public void chargeByLightning(){}
    }
    class Android implements UsbPort{
        public void chargebyUsb(){}
    }
    interface LightningPort{
         void chargeByLightning();
    }
    interface UsbPort{
         void chargebyUsb();
    }
