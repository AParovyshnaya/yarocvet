/*https://dev.to/hadrysmateusz/ultimate-guide-to-file-handling-in-client-side-javascript-4ki3
true JSON reading at the future 
*/

function main() {
	pin(get());
}

function get() {
		fetch('events-map/resources/towns.events')
  .then(response => {
    if (!response.ok) {
      throw new Error('Ой, ошибка в fetch: ' + response.statusText);
    }
    return response.json();
  })
  .then(jsonData => console.log(jsonData))
  .catch(error => console.error('Ошибка при исполнении запроса: ', error));
// 	const sample = require('./events-map/resources/roads.events');
}

function pin(data) {
/*	const fs = require('fs');

	let rawdata = fs.readFileSync('resources/towns.events');
	let students = JSON.parse(rawdata);*/

	console.log(data[0].start);
	map(mark());
}

function map(dots) {
	let base = document.getElementById("canvas");
	let map = auxiliary();
	map = decorate(plot(map, dots));
}

function auxiliary() {
	let map = document.createElement("div");
	map.className = "map";

}

function plot(map, dots) {
	for (dot in dots) {
		map.append(dot);
	}
	return map;
}

function decorate(canvas) {
	canvas = grid(canvas);
	canvas = rims(canvas);
	canvas = gaps(canvas);
	return canvas;
}

function grid(canvas) {
	return canvas;
}
function rims(canvas) {
	return canvas;
}
function gaps(canvas) {
	return canvas;
};


function mark() {
	return describe(dots(coordinate()));
}

function coordinate() {
	let y = latitude();
	let x = longitude();
	return detailing(x, y);
}

function latitude() {
	return;
}

function longitude() {
	return;
}

function detailing(x, y) {
	return;
}

function dots(data) { }

function describe(data) {
	return;
}