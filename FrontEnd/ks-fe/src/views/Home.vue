<template> 
    <div>
        <h1 class="text-center">Taxonomía de ciberseguridad basada en ACM</h1>
        <div class="text-center grey--text mb2">
            Una taxonomía basada en las áreas de conocimientos
            del ACM para cubrir líneas de investigación.
        </div>
        <br>
        <hr>
        <div>
            <h3>La taxonomía se compone de lo siguiente:</h3>
            <br>
            <ul>
                <li>Knowledge Area (KA) y New Trends</li>
                <li>Knowledge Units (KU)</li>
                <li>Congresses</li>
                <li>Certifications</li>
                <li>Research by sector (Keyword and Knowledge Objetive)</li>
                <li>Work Roles (Knowledge, Skills and Abilities)</li>
            </ul>
        </div>
        <br>
        <br>
        <div>
            <v-btn
             elevation="2"
             block
             :color="active ? 'primary' : undefined"
             :dark="active"
             class="mx-auto"
             rounded="xl"
             @click="onCLickGetIn"
             >{{ active ? 'Ingresando . . .' : 'Ingresar' }}</v-btn>
        </div>
    </div>

 
</template>

<script>
export default {
    name: "Home",
    data:()=>({
        active: false,
    }),
    methods:{
        onCLickGetIn(){
            this.active = true;
            this.$router.push('/karea');
        }    
    }
}
</script>

