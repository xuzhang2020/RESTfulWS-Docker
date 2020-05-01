
## RESTful Web Service & Docker


### About RESTful Web Service


In this sample project, I use the front and back end seperation technology. At back end I use SpringBoot freamework, the JSON file based database, and supply RESTful web service for the front requests. At the front end, I use html and ajax technology. The function of RESTful web service is to query the customers and orders collection, and a single customer or a single order.

1. Create SpringBoot project.
   Create a simple start SpringBoot project from the web page `https://start.spring.io/`.
   Download the project after completing the required attributes, such as project type ( I choose `Maven Project`), Language ( I choose `Java`), project metadata Group Id、 Artifact Id etc.
   
2. Using maven/pom.xml to manage dependencies.   
   In this project, `spring-boot-starter` `spring-boot-starter-test` `spring-boot-starter-web` `spring-boot-starter-thymeleaf` `org.json` are needed.
   You can find more dependencies and the correct way of reference on the web site `https://mvnrepository.com/`.
   
3. Data layer
   I choose using the json file based database. So I use json file `db.json` to store the datas of customers, orders and order items.
   Read and convert json file data to java object. 
```
   import com.fasterxml.jackson.databind.ObjectMapper;
   ...
   ObjectMapper objectMapper = new ObjectMapper();
   jsonData = objectMapper.readValue(content.toString(),JsonData.class);
```
   See `JsonService.java` to get more details.
   
4. Service layer.
5. Controll layer.
6. json response
6. Html&Ajax.
`
### About Docker

1. Installation
2. Dockerfile
3. Build jar 
4. Deploy to docker

<br />

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

