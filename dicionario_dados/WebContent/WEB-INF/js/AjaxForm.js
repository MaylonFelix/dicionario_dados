$(document).ready(function() {
					// Stops the submit request
					$("#myAjaxRequestForm").submit(function(e) {
						e.preventDefault();
					});

					// checks for the button click event
					$("#salvar").click(function(e) {
						dataJson = {nome : $('#nome').val(),
					            	descricao :$('#descricao').val()}
						//dataString = $("#myAjaxRequestForm").serialize();
						
						$.ajax({contentType: "application/x-www-form-urlencoded; charset=UTF-8",
								type : "POST", // Foi só trocar para POST que funcionou.
								url : "CadastraEntidadeAjax",
								data : dataJson,
								cache: false,
								dataType : "json",    //dado que eu recebo do servidor
								scriptCharset: "utf-8" ,
								// if received a response from the server
								success : function(data,textStatus, jqXHR) {
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

													// If there was no response from the server
								error : function(jqXHR,	textStatus,	errorThrown) {
														console.log("Something really bad happened "+ textStatus);
														$("#ajaxResponse").html(jqXHR.responseText);
													},

													// capture the request before it was sent to server
								beforeSend : function(jqXHR, settings) {
														// disable the button until we get the response
														$('#salvar').attr("disabled",	true);
													},

													// this is called after the response or error functions are finished so that we can take some action
								complete : function(jqXHR,textStatus) {
														// enable the button
														$('#salvar').attr("disabled",false);
													}

												});
									});

				});