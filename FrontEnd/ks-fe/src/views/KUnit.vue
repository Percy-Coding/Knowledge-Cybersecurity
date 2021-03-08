<template>
  <div>
    <h2>
        >>>
      <router-link :to="{ name: 'KArea' }">{{
        this.$route.params.idKA
      }}</router-link>
      >>>
      {{ this.$route.params.idKU }}
    </h2>
    <br>
    <v-container>
      <v-row no-gutters>
        <v-col cols="12" sm="5">
          <v-list>
            <v-list-item v-for="unit in unidadesLeft" :key="unit">
            <v-list-item-content>
                <v-card 
                height="25vh" 
                color="green lighten-4">
                    <v-toolbar color="indigo" dark>
                        <v-toolbar-title>{{unit}}</v-toolbar-title>
                    </v-toolbar>
                </v-card>
            </v-list-item-content>
            </v-list-item>
          </v-list>
        </v-col>
        <v-col cols="12" sm="2"></v-col>
        <v-col cols="12" sm="5">
          <v-list>
            <v-list-item v-for="unit in unidadesRight" :key="unit">
                <v-list-item-content>
                <v-card height="25vh" color="green lighten-4">
                    <v-toolbar color="indigo" dark>
                        <v-toolbar-title>{{unit}}</v-toolbar-title>
                    </v-toolbar>
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
      kunitid: this.$route.params.id,
      unidadesLeft: ['Certifications','Congreses','Tools'],
      unidadesRight: ['Research','Work Roles']
    };
  },
};
</script>
