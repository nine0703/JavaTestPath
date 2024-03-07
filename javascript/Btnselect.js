function Btnselect() {
	let text = document.getElementById("find").value;
	let src = `https://www.baidu.com/s?wd=${text}`;
	window.open(src);
}
