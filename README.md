
## First Single Page Application - ReactJS


### About making the project


This project is react single web page application.In the project, I used React, Sass, Node.js and Gulp.<br />

React routing technology is used to achieve the page routing of the home page and blog details page.
```
	import {  Route,  NavLink,  HashRouter} from "react-router-dom";
	<HashRouter>
		<Route exact path="/" component={a js file name}/>
		<Route path="/route name" component={another js file name}/>
	</HashRouter>
```
See Main.js file for more information about the react routing technology.

React props and state is used to pass and receive parameters among pages.

Pass parameters:
```
	<div className="card-body" style={styles[post.id%3]}>
	  <Link to={{pathname: '/Detail',state:{title:post.title,img:post.pic,content:post.content}}}><h4>{post.title}</h4></Link>
	  <h3>{post.postdate}</h3>
	</div>
```	
Receive and use parameters:		  
```
	<h2 className="title">{this.props.location.state.title}</h2>
	<div>
		  <img src={require('./images/' + this.props.location.state.img)}></img>
	</div>
```
Sass technology and scss files is used to manage the css styles of page elements.
See Style.scss file for more information about the react routing technology.

The Google News API, react timer and AJAX technology is used to display Google news headlines in a div. The content of the div updates every 5 seconds.
```
	this.timer = setInterval(function () {
		axios.get('http://newsapi.org/v2/top-headlines?sources=google-news&apiKey=keyvaluee')
		.then(function (response) {
			console.log(response);
			
			this.setState({
				articles: response.data.articles
			});
		}.bind(this));
	}.bind(this), 5000);
```
See Nav.js file for more information.

Some steps about building the development environment before programming.
1. Download Node.js and install it.
2. Use npm command to install 'create-react-app' modeule.

	`npm install create-react-app`
	
3. Use npm command to create a React project.

	`create-react-app react_blog`
	
4. Before using React router technology, use npm command to install 'react-router-dom' module.

	`npm install react-router-dom --save`
	
5. Before using React AJAX technology, use npm command to install 'react-router-dom' module.

	`npm install axios --save`
	
See project files for more information.

### About running the project
1. Download the project files. It's a zip package.
2. Unzip the zip package. The decompressed file directory  name is 'react_blog_master'.
3. Download Node.js and install it.
4. Use system command line tool and execute commands belows in turn:

	`cd react_blog_master`
	
	`npm install`
	
	`npm start`
	
5. After nmp start executed, you can type http:localhost:3000 in the Google Chrome navigation bar and press the Enter key.
   The home page of this project will display.

