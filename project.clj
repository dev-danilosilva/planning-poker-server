(defproject planning-poker "0.1.0-SNAPSHOT"
  :description "Web server to mananage planning poker app websocket connections"
  :url "https://github.com/dev-danilosilva/planning-poker"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure           "1.10.1"]
                 [com.taoensso/carmine          "3.1.0"]
                 [com.stuartsierra/component    "1.0.0"]
                 [prismatic/schema              "1.2.0"]
                 [io.pedestal/pedestal.log      "0.5.9"]
                 [io.pedestal/pedestal.service  "0.5.9"]
                 [io.pedestal/pedestal.jetty    "0.5.9"]
                 [io.pedestal/pedestal.route    "0.5.9"]]
  :main ^:skip-aot planning-poker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
