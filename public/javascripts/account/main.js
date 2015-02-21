function onLoadCallback()
{
    gapi.client.setApiKey('AIzaSyDt66B4MPWeSNQjQxBJVQYNcA_FtJy7aL4'); //set your API KEY
    gapi.client.load('plus', 'v1',function(){});//Load Google + API
}

function login() 
{
  var myParams = {
    'clientid' : '217424239173-75719ljeaia9c2mpr27mtlv4trhebs2i.apps.googleusercontent.com', //You need to set client id
    'cookiepolicy' : 'single_host_origin',
    'callback' : 'loginCallback', //callback function
    'approvalprompt':'force',
    'scope' : 'https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/plus.profile.emails.read',
  };
  gapi.auth.signIn(myParams);
  console.log('myparams');
console.log(myParams);
}

  function loginCallback(result)
	{	
		var send_email = '';
		var full_name = '';
		console.log('Result');
		console.log(result);
	    if(result['status']['signed_in'])
	    { 
	        alert("Login Success");
	        var request = gapi.client.plus.people.get({
			    'userId': 'me'
			});
			console.log('request');
			console.log(request);
			request.execute(function (resp)
			{
			    var email = '';
			    if(resp['emails'])
			    {
			        for(i = 0; i < resp['emails'].length; i++)
			        {
			            if(resp['emails'][i]['type'] == 'account')
			            {
			                email = resp['emails'][i]['value'];
			            }
			        }
			    }
			 	send_email = email;
			 	full_name = resp['displayName'];
			    jQuery.ajax({
			        type: 'POST',
			        url: '/api/signup',
			        data: {email : send_email, fullname : full_name},
			        dataType: 'JSON',
			        success: function(result) {
			        	if(result.status_code == 200)
			        	{
			        		window.location.href="/dashboard";
			        	}
			        	else if(result.status_code == 401)
		                {
		                    window.location.href="/login";
		                }
			        	else
			        	{
			        		alert(result.data.Reason);
			        	}
			        }
		    	}); 
			    // var str = "Name:" + resp['displayName'] + "<br>";
			    // str += "Image:" + resp['image']['url'] + "<br>";
			    // str += "<img src='" + resp['image']['url'] + "' /><br>";
			 
			    // str += "URL:" + resp['url'] + "<br>";
			    // str += "Email:" + email + "<br>";
			    // document.getElementById("profile").innerHTML = str;
			});	
	    }  	 
	}

function logout()
{
    gapi.auth.signOut();
    location.reload();
}

jQuery(document).ready(function(){

//	jQuery('#signIn').submit(function(){
//	    var srt = jQuery("#" + jQuery(this).attr("id")).serialize();
//    	jQuery.ajax({
//	        type: 'POST',
//	        url: '/api/login',
//	        data: srt,
//	        dataType: 'JSON',
//	        success: function(result) {
//	        	if(result.status_code == 200)
//	        	{
//	        		window.location.href="/dashboard";
//	        	}
//	        	else if(result.status_code == 401)
//                {
//                    window.location.href="/login";
//                }
//	        	else
//	        	{
//	        		alert(result.data.Reason);
//	        	}
//	        }
//    	});
// 	});

	$("#submit").click(function(){
        		console.log('clicked');
		var pass = $('#password').val();
		var conf_pass = $('#confirm_pass').val();
		var email = $('#email').val();
		var full_name = $('#full_name').val();
			var signData={
							"email" : email, 
							"fullname" : full_name, 
							"password" : pass
						 };
			// var formData = new FormData($(this)[0]);
//		    var srt = jQuery("#" + jQuery(this).attr("id")).serialize();
		    $.ajax({
		        url: '/api/signup',
		        type: 'POST',
		        data: JSON.stringify(signData),
		        success: function (result) {
		        	console.log(result);
		           if(result.status_code == 200)
		        	{
		        		window.location.href="/dashboard";
		        	}
		        	else if(result.status_code == 401)
	                {
	                    window.location.href="/login";
	                }
		        	else
		        	{
		        		alert(result.data.Reason);
		        	}
		        }
		    });
     });
	    
});

	 