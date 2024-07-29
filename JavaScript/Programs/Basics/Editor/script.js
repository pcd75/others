"use restrict";

/*
const x = 23;

if (x === 23) console.log(23);

console.log(1234);
*/

//debugging

const measureKelvin = function () {
  const measurement = {
    type: "temp",
    unit: "celsius",

    //fix
    value: Number(prompt("Degree celcius")),
  };

  console.log(measurement);
  console.table(measurement);

  //   console.log(measurement.value);
  //   console.warn(measurement.value);
  //   console.error(measurement.value);

  const kelvin = measurement.value + 273;
  return kelvin;
};

console.log(measureKelvin());
