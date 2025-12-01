 const ima = document.getElementById("imagemZika")
        const btn = document.getElementById("enviar")
        const msg = document.getElementById("censura")
        const chat = document.getElementById("chat")
//compra shawarma
        btn.addEventListener('click',()=>{
            const texto = msg.value
            const agora = new Date()

            const horas = agora.getHours().toString().padStart(2, '0')
            const minutos = agora.getMinutes().toString().padStart(2, '0')

            const msgFull = `[${horas}: ${minutos}]\n User: ${texto}`

            chat.value += msgFull + "\n\n"
            msg.value = ""

        })

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
