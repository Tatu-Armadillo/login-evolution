const URL = 'http://localhost:8080/evo/';

const user = {
    idUsuario: undefined,
    username: undefined,
    password: undefined
};

const singIn = () => {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetch(URL + `login?username=${username}&password=${password}`, { method: "GET" })
        .then(dado => dado.json())
        .then(d => {
            if (d.data) {
                user.idUsuario = d.data.idUsuario,
                user.username = d.data.username,
                user.password = d.data.password
                viewUser(user);
            }
        });
}

const viewUser = (user) => {
    const div = document.getElementById('on');
    div.innerHTML += `<h3>Usuario ${user.username} Logado com sucesso</h3>`;
}