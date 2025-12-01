 const ima = document.getElementById("imagemZika")
        const btn = document.getElementById("enviar")
        const msg = document.getElementById("censura")
        const chat = document.getElementById("chat")
//compra shawarma
 let palavroesDoBanco = [];

 // 1️⃣ Buscar palavrões do banco ao iniciar
 fetch("http://localhost:8080/api/palavrões")
     .then(res => res.json())
     .then(data => {
         palavroesDoBanco = data.map(item => item.feia.toLowerCase());
         console.log("Palavrões carregados:", palavroesDoBanco);
     })
     .catch(err => console.error("Erro ao carregar palavrões:", err));

 // 2️⃣ Enviar mensagem
 btn.addEventListener("click", () => {
     const texto = msg.value.trim();
     if (texto === "") return;

     const agora = new Date();
     const horas = agora.getHours().toString().padStart(2, "0");
     const minutos = agora.getMinutes().toString().padStart(2, "0");

     // Verificar palavrões
     let mensagemFiltrada = texto;
     palavroesDoBanco.forEach(p => {
         const regex = new RegExp(`\\b${p}\\b`, "gi");
         mensagemFiltrada = mensagemFiltrada.replace(regex, "***");
     });

     const msgFull = `[${horas}:${minutos}]\n User: ${mensagemFiltrada}`;

     chat.value += msgFull + "\n\n";
     msg.value = "";
 });


 ima.addEventListener('mouseover',()=>{
     const eas = document.getElementById("easter")
     eas.classList.add("easterEggShow")
     console.log(`aparecendo`)
 })

 ima.addEventListener('mouseout', ()=>{
     const eas = document.getElementById("easter")
     eas.classList.remove("easterEggShow")
     console.log("saindo")
 })
