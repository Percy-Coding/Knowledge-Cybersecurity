<template>
  <div align="center">
    <br>
    <h1>Áreas de Conocimientos y New Trends</h1>
    <br />
    <div>
      <v-list>
        <v-list-item v-for="item in areas" :key="item.id">
          <v-list-item-content>
              <v-card
                class="mx-auto"
                max-width="60vw"
                max-height="70vh"
                >
                  <v-toolbar
                  color="indigo"
                  dark>
                    <v-toolbar-title>
                      <v-icon>mdi-shield-lock</v-icon>
                      {{item.title}}
                    </v-toolbar-title>
                    <v-spacer></v-spacer>
                    <v-btn icon v-on:click="onClickArrow(item)">
                      <v-icon v-if="item.arrowed">mdi-arrow-up</v-icon>
                      <v-icon v-else>mdi-arrow-down</v-icon>
                    </v-btn>
                  </v-toolbar>
                  <v-card-text v-if="item.arrowed">
                    <p>{{item.description}}</p>
                    <hr>
                    <br>
                    <v-header class="title-bold">Unidades de Conocimiento</v-header>
                    <v-list-item v-for="ku in item.kunit" :key="ku">
                      <v-list-item-content>
                        <v-card 
                        color="green accent-3"
                        max-width="30vw"
                        max-height="5vh"
                        class="mx-auto"
                        @click="onClickKunit(item,ku)">
                        <v-card-text>
                          {{ku}}
                        </v-card-text>
                        </v-card>
                      </v-list-item-content>
                    </v-list-item>                      
                  </v-card-text>
              </v-card>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "KArea",
  data() {
    return {
      areas: [
      ],
    };
  },
  methods:{
      getKAreas(){
          axios.get('http://www.json-generator.com/api/json/get/ceYOXYCHZu?indent=2')
          .then( (response) => {
            let initialAreas = response.data;
            this.areas = initialAreas.map(function(obj){
            let o =  Object.assign({},obj);
            o.arrowed = false;
            return o;
          });
          });
          
                    
      },
      onClickArrow(item){
        item.arrowed = !item.arrowed;
      },
      onClickKunit(item,ku){
         this.$router.push({
           name: "KUnit",params:{idKA: item.title, idKU: ku, id: item.id}
           });
      },
      /*getKUnitsById(){
          return;
      }*/
  },
  mounted(){
      this.getKAreas();
  }
  
};
</script>

<style scoped>
.title-bold{
    font-weight: 300;
    font-size: 22px;
}
</style>