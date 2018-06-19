(defproject mradke/mailer "1.4.0-SNAPSHOT"
  :description "Fork of clojurewerkz/mailer. Uses yogthos/Selmer templates instead of davidsantiago/stencil (if you need templates with logic)"
  :url "https://github.com/clojurewerkz/mailer"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.draines/postal "1.11.3"]
                 [selmer "1.11.7"]
                 [clojurewerkz/support "1.1.0"]
                 [clojurewerkz/route-one "1.1.0"]]
  :test-selectors {:focus :focus
                   :all   (constantly true)}
  :source-paths ["src/clojure"]
  :profiles {:dev    {:resource-paths ["test/resources"]}
             :1.8    {:dependencies [[org.clojure/clojure "1.8.0-RC4"]]}
             :master {:dependencies [[org.clojure/clojure "1.8.0-master-SNAPSHOT"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.8:dev,master"]}
  :repositories {"clojure-releases"   "http://build.clojure.org/releases"
                 "sonatype"           {:url       "http://oss.sonatype.org/content/repositories/releases"
                                       :snapshots false
                                       :releases  {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url       "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases  {:checksum :fail :update :always}}}
  :global-vars {*warn-on-reflection* true})
