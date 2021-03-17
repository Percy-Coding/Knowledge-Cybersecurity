<template>
<v-app>
  <v-app-bar app
    color="warning">    
    <v-app-bar-title>
      Knowledge CyberSecurity
    </v-app-bar-title>
    <v-spacer></v-spacer>
    <div class="links">
      <router-link  to="/">Home</router-link>
      <router-link  to="/about">About</router-link>
    </div>
    
   
      
  </v-app-bar>
  <v-main>
    <router-view/>
  </v-main>
</v-app>
</template>



<style scoped>
.links > * {
  margin: 20px;
}
</style>

