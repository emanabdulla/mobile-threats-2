(defproject clojure-mmaa "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [tolitius/xml-in "0.1.1"] 
                 [org.clojure/data.xml "0.0.8"]
                 [org.clojure/data.zip "1.0.0"]
                 [uk.org.russet/tawny-owl "2.0.0-SNAPSHOT"]]
  :repl-options {:init-ns clojure-mmaa.core})
