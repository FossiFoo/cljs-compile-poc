(defproject cljs-compile-poc "0.1.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.473"]
                 [io.replikativ/geheimnis "0.1.0"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :clean-targets ^{:protect false} ["target"]

  :cljsbuild
  {:builds [{:id "cljs_repl"
             :source-paths ["src"]
             :figwheel true
             :compiler
             {:main core
              :asset-path "js/out"
              :libs ["gclosure/pkcs7.js"]
              :output-to "target/client.js"
              :output-dir "target"
              :optimizations :none
              :pretty-print true}}]})
