(ns pegboard.routes.services
  (:require [ring.util.http-response :refer :all]
            [cheshire.core :refer :all]
            [compojure.api.sweet :refer :all]
            [schema.core :as s]))

(defapi service-routes
  {:swagger {:ui "/swagger-ui"
             :spec "/swagger.json"
             :data {:info {:version "1.0.0"
                           :title "Sample API"
                           :description "Sample Services"}}}}
  
  (context "/api" []
    (GET "/fuck" []
      :summary "say fuck one more time"
     (generate-string {:k "fuck"}))))
      
