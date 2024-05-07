const getData = () => {
    fetch('http://localhost:8080/api/getUsers')
        .then(response => response.json())
        .then(data => console.log(data));
}