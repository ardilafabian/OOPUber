function Car(license, driver) {
    this.id;
    this.licence = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDatacar = function () {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
}