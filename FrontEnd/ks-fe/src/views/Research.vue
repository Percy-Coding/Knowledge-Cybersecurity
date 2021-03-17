<template>
    <v-container>
        <div>
          <div class="d-inline-flex">
          <v-tooltip bottom>
            <template v-slot:activator="{on}">
              <v-btn icon
              @click="$router.go(-1)"
              v-on="on"
              color="blue accent-3">
                <v-icon>mdi-skip-backward</v-icon>
              </v-btn>
            </template>
            <span>Atrás</span>
          </v-tooltip>
          </div>
          <div class="d-inline-flex">
          <h2>
             /{{this.$route.params.idKU}}/{{this.$route.params.researchName}}
          </h2>
          </div>
        </div>
        <v-text-field
          v-model="newKeyword"
          label="Keyword"
          append-icon="mdi-plus-circle-outline"
          single-line
          hide-details
          @click:append="addFilterItems(newKeyword)"
          >
        </v-text-field>
        <br>
        <v-card elevation="5" min-height="100px">
          <v-container fluid>
            <v-row>
              <v-col v-for="item in filterItems" :key="item">
                <v-card class='green accent-3'>
                  <v-card-text  class="text-center" >
                    {{item}}
                    <v-btn icon>
                       <v-icon @click="removeFilterItems(item)">mdi-minus-circle-outline</v-icon>
                    </v-btn>
                  </v-card-text>
                </v-card>
              </v-col>
            </v-row>
          </v-container>                              
        </v-card>
        <div class="d-flex justify-end my-3">
          <v-btn depressed color="white" @click="expand = !expand">
            <span>Filtrado avanzado</span>
            <v-icon>mdi-cog-outline</v-icon>
          </v-btn>
        </div>
        <div>
          <v-expand-transition>
            <v-card
            v-show="expand"
            height="100"
            width="90vw"
            class="mx-auto blue accent-3">
            </v-card>
          </v-expand-transition>
        </div>
        <br>
        <div class="mx-auto text-center">
          <v-btn color="black accent-2" dark @click="filterActive = true">
            Filtrar
          </v-btn>
        </div>
        <br>
        <v-card v-if="filterActive">
          <v-card-title>
            Resultados filtrados
          </v-card-title>
          <v-data-table
            :headers="headers"
            :items="desserts"
            :search="search"
          ></v-data-table>
        </v-card>
        <v-card v-else class="mx-auto" max-width="315px" dark color="red">
          <v-card-title> Aún no se han filtrados papers</v-card-title>
        </v-card>
    </v-container>
</template>

<script>
  export default {
    data () {
      return {
        expand: false,
        newKeyword: '',
        filterActive: false,
        filterItems: [],
        search: '',
        headers: [
          {
            text: 'Paper Name',
            align: 'start',
            filterable: true,
            value: 'name',
          },
          { text: 'someText1', value: 'calories' },
          { text: 'someText2', value: 'fat' },
          { text: 'someText3', value: 'carbs' },
          { text: 'someText4', value: 'protein' },
          { text: 'someText5', value: 'iron' },
        ],
        desserts: [
          {
            name: 'SomePaper1',
            calories: 159,
            fat: 6.0,
            carbs: 24,
            protein: 4.0,
            iron: '1%',
          },
          {
            name: 'SomePaper2',
            calories: 237,
            fat: 9.0,
            carbs: 37,
            protein: 4.3,
            iron: '1%',
          },
          {
            name: 'SomePaper3',
            calories: 262,
            fat: 16.0,
            carbs: 23,
            protein: 6.0,
            iron: '7%',
          },
          {
            name: 'SomePaper4',
            calories: 305,
            fat: 3.7,
            carbs: 67,
            protein: 4.3,
            iron: '8%',
          },
          {
            name: 'SomePaper5',
            calories: 356,
            fat: 16.0,
            carbs: 49,
            protein: 3.9,
            iron: '16%',
          },
          {
            name: 'SomePaper6',
            calories: 375,
            fat: 0.0,
            carbs: 94,
            protein: 0.0,
            iron: '0%',
          },
          {
            name: 'SomePaper7',
            calories: 392,
            fat: 0.2,
            carbs: 98,
            protein: 0,
            iron: '2%',
          },
          {
            name: 'SomePaper8',
            calories: 408,
            fat: 3.2,
            carbs: 87,
            protein: 6.5,
            iron: '45%',
          },
          {
            name: 'SomePaper9',
            calories: 452,
            fat: 25.0,
            carbs: 51,
            protein: 4.9,
            iron: '22%',
          },
          {
            name: 'SomePaper10',
            calories: 518,
            fat: 26.0,
            carbs: 65,
            protein: 7,
            iron: '6%',
          },
        ],
      }
    },
    methods:{
      addFilterItems(kw){
        this.filterItems.push(kw);
        this.newKeyword = '';       
      },
      removeFilterItems(kw){
        let index = this.filterItems.indexOf(kw);
        this.filterItems.splice(index,1);        
      }
    }
  }
</script>

<style scoped>
    .v-text-field{
      width: 280px;
    }
</style>
