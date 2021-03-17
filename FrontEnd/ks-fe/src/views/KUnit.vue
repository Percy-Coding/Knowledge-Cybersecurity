<template>
  <div>
    <br>
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
           <h2>/{{KA}}/{{ KU }}</h2>
      </div>
    </div>
    <v-container>
      <v-row no-gutters>
        <v-col cols="12" sm="6" md="6">
          <v-list>
            <v-list-item v-for="unit in unidadesLeft" :key="unit.title">
            <v-list-item-content>
                <v-card 
                color="green lighten-4">
                    <v-toolbar color="indigo" dark>
                        <v-toolbar-title>{{unit.title}}</v-toolbar-title>
                        <v-spacer/>
                        <v-btn icon @click="unit.arrow = !unit.arrow">
                          <v-icon v-if="unit.arrow">mdi-arrow-up</v-icon>
                          <v-icon v-else>mdi-arrow-down</v-icon>
                        </v-btn>
                    </v-toolbar>
                </v-card>
            </v-list-item-content>
            </v-list-item>
          </v-list>
        </v-col>
        <v-col cols="12" sm="6" md="6">
          <v-list>
            <v-list-item v-for="unit in unidadesRight" :key="unit.title">
                <v-list-item-content>
                <v-card color="green lighten-4">
                    <v-toolbar color="indigo" dark>
                        <v-toolbar-title>{{unit.title}}</v-toolbar-title>
                         <v-spacer/>
                        <v-btn icon @click="unit.arrow = !unit.arrow">
                          <v-icon v-if="unit.arrow">mdi-arrow-up</v-icon>
                          <v-icon v-else>mdi-arrow-down</v-icon>
                        </v-btn>
                    </v-toolbar>
                    <v-card-text v-if="unit.arrow">
                    <v-list-item v-for="test in testResearch" :key="test">
                      <v-list-item-content>
                        <v-card 
                        class="pa-3">
                         <router-link 
                         style="text-decoration: none;"
                         :to="{name: 'Research', params: {idKA : KA, idKU: KU, researchName: test } }">
                          {{test}}
                         </router-link>
                        </v-card>                      
                      </v-list-item-content>
                    </v-list-item>                      
                    </v-card-text>
                </v-card>
            </v-list-item-content>
            </v-list-item>            
          </v-list>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  props: {},
  data() {
    return {
      KA: this.$route.params.idKA,
      KU: this.$route.params.idKU,
      unidadesLeft: [
        {title:'Certifications',arrow: false},
        {title:'Congreses',arrow: false},
        {title:'Tools',arrow: false}
        ],
      unidadesRight: [
        {title:'Research',arrow: false},
        {title:'Work Roles',arrow: false}
        ],
      testResearch: ['Agriculture','Education','Banking','Biology']
    };
  },
};
</script>
