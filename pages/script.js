const URL = 'http://localhost:8080/evo/';

const user = {
    username: undefined,
    password: undefined
};

const singIn = () => {
    user.username = document.getElementById('username').value;
    user.password = document.getElementById('password').value;

    fetch(URL + `login`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)

    })
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