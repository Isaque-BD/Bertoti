const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const inome = document.querySelector(".nome");
const iemail = document.querySelector(".email");
const isenha = document.querySelector(".senha");
const itelefone = document.querySelector(".telefone");

function cadastrar(){

    fetch("http://localhost:8080/usuario",
        {
            headers:{
                'Accept': 'application/json',
                'Content-Type':'application/json'

            },
            method: "POST",
            body: JSON.stringify({
                nome: inome.value,  
                email: iemail.value,
                senha: isenha.value,
                telefone: itelefone.value
            })
            
            
        })
        .then(function(res) {console.log(res)})
        .catch(function (res) {console.log(res)})
};

function limpar(){
    nome: inome.value = "";
    email: iemail.value ="";
    senha: isenha.value = "";
    telefone: itelefone.value = "";


};

formulario.addEventListener('submit', function(event){
    event.preventDefault();
    
    cadastrar();
    limpar();
   
});