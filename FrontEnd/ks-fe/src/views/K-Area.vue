<template>
  <div align="center">
    <br>
    <h1>Áreas de Conocimientos y New Trends</h1>
    <br />
    <div>
      <v-list>
        <v-list-item v-for="item in areas" :key="item.title">
          <v-list-item-content>
              <v-card
                class="mx-auto"
                max-width="400"
                height="100"
                hover>
                  <v-list-item-title v-text="item.title" 
                  class="title-bold"></v-list-item-title>
                  <br>
                  <v-card-text>{{item.description}}</v-card-text>
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
          axios.get('http://www.json-generator.com/api/json/get/cplBWgAdiW?indent=2')
          .then( (response) => this.areas = response.data);
      }
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
