/*https://dev.to/hadrysmateusz/ultimate-guide-to-file-handling-in-client-side-javascript-4ki3
true JSON reading at the future 
*/

function main() {
	pin();
}

function pin() {
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

function dots(data) {}

function describe(data) {
	return;
}
