from car import Car

class UberVan(Car):
    typerCarAccepted = []
    seatsMaterial = []

    def __init__(self, licence, driver, typerCarAccepted, seatsMaterial):
        super.__init__(licence, driver)
        self.typerCarAccepted = typerCarAccepted
        self.seatsMaterial = seatsMaterial
