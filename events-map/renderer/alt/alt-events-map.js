import towns from '/events-map/resources/towns.events' assert {type: 'json'}; // имя при импорте может не совпадать с именем файла



const container = document.getElementById("alternative-events-map");
//container.replaceChildren(generateAltEventsMap());
// // const towns = require("events-map/resources/towns.events");
console.log(towns);

function createElementAndSetClasses(name, classes) {
  const element = document.createElement(name);
  name.setAttribute("class", classes);
  return name;
}

function describeEvents() {


}

function describe(event) {
  // const host = createDescribeContainer();
  // let eventProperties;
  // host.append(eventProperties);
}



function getData(path) {

}

// function getData(path) {
//   fetch(path)
//     .then(response => {
//       if (!response.ok) {
//         throw new Error('Ой, ошибка в fetch: ' + response.statusText);
//       }
//       return response.json();
//     })
//     .then(jdata => {
//       for (const event of jdata) {
//         describe(event);
//       }
//     })
//     .catch(error => console.error('Ошибка при исполнении запроса: ', error));
//   // 	const sample = require('./events-map/resources/roads.events');
// }
