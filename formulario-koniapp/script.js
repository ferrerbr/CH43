const d =document;
function validaciones(){
    const $formulario = d.querySelector(".formulario-cont")
    const $inputs = d.querySelectorAll(".formulario-cont [required]")
    console.log($inputs);
    $inputs.forEach(input=>{
        const $span =d.createElement("span");
        $span.id=input.name;
        $span.textContent=input.title;
        $span.classList.add("formulario-cont-error","none");
        input.insertAdjacentElement("afterend",$span);
    });

    d.addEventListener("keyup",(e)=>{
        
        if (e.target.matches(".formulario-cont [required]")) {
            let $input = e.target;
            let pattern = $input.pattern||$input.dataset.pattern;
           // console.log($input);

            
            if(pattern && $input.value!==""){
                //console.log("tiene patron" );
                let regex =new RegExp(pattern);
                
                
                return !regex.exec($input.value)
                ?d.getElementById($input.name).classList.add("is-active")
                :d.getElementById($input.name).classList.remove("is-active")

                
            }
            if (!pattern) {
                //console.log("no tiene patron");
                return $input.value === ""
                ?d.getElementById($input.name).classList.add("is-active")
                :d.getElementById($input.name).classList.remove("is-active")
                
                
            }
            
           

        

        }
         
         
        

    })
}






d.addEventListener("DOMContentLoaded",(e)=>{
    validaciones();
    
})