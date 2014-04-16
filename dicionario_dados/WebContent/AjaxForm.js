$(document).ready(function() {
					// Stops the submit request
					$("#myAjaxRequestForm").submit(function(e) {
						e.preventDefault();
					});
					
					
					
					$("#teste").click(function(e) {window.alert("áéíóúãõàèìòùñçÇ")});
					
					// checks for the button click event
					$("#salvar").click(function(e) {
						dataJson = {nome : $('#nome').val(),
					            	descricao :$('#descricao').val()}
						// get the form data and then serialize that
						//dataString = $("#myAjaxRequestForm").serialize();
						//dataString= "nome=" +$('#nome').val()+"&descricao="+$('#descricao').val();
						//console.log(dataString);
						//alert(dataString);
						// get the form data using another method
						//var countryCode = $("input#countryCode").val();
						//dataString = "countryCode="+ countryCode;
						// make the AJAX request, dataType is set to json meaning we are expecting JSON data in response from the server
						//
						$.ajax({contentType: "application/x-www-form-urlencoded; charset=UTF-8",
								type : "POST", // Foi só trocar para POST que funcionou. Depois explico porque
								url : "CadastraEntidade",
								data : dataJson,
								cache: false,
								dataType : "json",    //dado que eu recebo do servidor
								scriptCharset: "utf-8" ,
								// if received a response from the server
								success : function(data,textStatus, jqXHR) {
											// our country code was correct so we have some information to display
											if (data.success) {
															$("#ajaxResponse").html("");
															console.log(data.entidade.nome);
															console.log(data.entidade.descricao);
															$("#ajaxResponse").append("<b>Nome:</b> "+ data.entidade.nome+ "");
															$("#ajaxResponse").append(" <b>Descrição:</b> "+ data.entidade.descricao+ "");
															window.alert("Descrição: "+ data.entidade.descricao+ "");
														}
														// display error message
														else {
															$("#ajaxResponse").html("<div><b>Erro!</b></div>");
														}
													},

													// If there was no resonse from the server
								error : function(jqXHR,	textStatus,	errorThrown) {
														console.log("Something really bad happened "+ textStatus);
														$("#ajaxResponse").html(jqXHR.responseText);
													},

													// capture the request before it was sent to server
								beforeSend : function(jqXHR, settings) {
														// jqXHR.overrideMimeType("application/json; charset=UTF-8");
														// jqXHR.setRequestHeader("Accept-Charset", "utf-8");
														//jqXHR.setRequestHeader("Accept-Charset","utf-8");
														// adding some Dummy data to the request
														//settings.data += "&dummyData=whatever";
														// disable the button until we get the response
														$('#salvar').attr("disabled",	true);
													},

													// this is called after the response or error functions are finsihed so that we can take some action
								complete : function(jqXHR,textStatus) {
														// enable the button
														$('#salvar').attr("disabled",false);
													}

												});
									});

				});