This is Scala School - a set of lessons covering the Scala programming language.

We use [jekyll](https://github.com/mojombo/jekyll) to generate the site. In order to build it, you must first install it:

	$ gem install jekyll

should do. Now, build the site with `make`. This will create a copy of the lessons in the `web.out` folder.

For development, you'll also need to install [RedCloth](https://redcloth.org/).

	$ gem install RedCloth
	$ gem install jekyll-textile-converter

Then `make serve` will launch `jekyll` in serving mode: a web server will be launched on port 4000, and changing files will automatically rebuild the site.

To publish to https://tushar8194.github.io/website-doc/:

	$ make publish


Steps :

1. sudo gem install jekyll


2. Create repo
https://pages.github.com

3. jekyll new .

4. vi Gemfile
Add "#" to the beginning of the line that starts with gem "jekyll" to comment out this line.

5. Add the github-pages gem by editing the line starting with # gem "github-pages". Change this line to:
gem "github-pages", "~> 214", group: :jekyll_plugins

6. bundle update

7. #run site locally to see immidiate effect 
bundle exec jekyll serve

8. add theme in your repo

-----------------------------------------------

sudo gem install RedCloth

sudo gem install jekyll-textile-converter
