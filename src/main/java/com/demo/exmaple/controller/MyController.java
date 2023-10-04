package com.demo.exmaple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springactuator")
public class MyController {

	@GetMapping("/test")
	public String testEndPoint() {
		return "Spring Boot actutator example";
	}
	
	//http://localhost:8080/actuator/health
	/*
	 {
    "status": "UP"
     }
     */
	
//	http://localhost:8080/actuator/mappings
//		
//	{
//	    "contexts": {
//	        "application": {
//	            "mappings": {
//	                "dispatcherServlets": {
//	                    "dispatcherServlet": [
//	                        {
//	                            "handler": "Actuator web endpoint 'caches'",
//	                            "predicate": "{DELETE [/actuator/caches]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "DELETE"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/caches"
//	                                    ],
//	                                    "produces": []
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'health'",
//	                            "predicate": "{GET [/actuator/health], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/health"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'health-path'",
//	                            "predicate": "{GET [/actuator/health/**], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/health/**"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'info'",
//	                            "predicate": "{GET [/actuator/info], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/info"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'loggers-name'",
//	                            "predicate": "{GET [/actuator/loggers/{name}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/loggers/{name}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'conditions'",
//	                            "predicate": "{GET [/actuator/conditions], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/conditions"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'loggers-name'",
//	                            "predicate": "{POST [/actuator/loggers/{name}], consumes [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "POST"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/loggers/{name}"
//	                                    ],
//	                                    "produces": []
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'configprops-prefix'",
//	                            "predicate": "{GET [/actuator/configprops/{prefix}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/configprops/{prefix}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'heapdump'",
//	                            "predicate": "{GET [/actuator/heapdump], produces [application/octet-stream]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/heapdump"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/octet-stream",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'threaddump'",
//	                            "predicate": "{GET [/actuator/threaddump], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/threaddump"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'beans'",
//	                            "predicate": "{GET [/actuator/beans], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/beans"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'configprops'",
//	                            "predicate": "{GET [/actuator/configprops], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/configprops"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'caches-cache'",
//	                            "predicate": "{GET [/actuator/caches/{cache}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/caches/{cache}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'env'",
//	                            "predicate": "{GET [/actuator/env], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/env"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'caches-cache'",
//	                            "predicate": "{DELETE [/actuator/caches/{cache}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "DELETE"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/caches/{cache}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'scheduledtasks'",
//	                            "predicate": "{GET [/actuator/scheduledtasks], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/scheduledtasks"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'metrics-requiredMetricName'",
//	                            "predicate": "{GET [/actuator/metrics/{requiredMetricName}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/metrics/{requiredMetricName}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'threaddump'",
//	                            "predicate": "{GET [/actuator/threaddump], produces [text/plain;charset=UTF-8]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/threaddump"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "text/plain;charset=UTF-8",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'metrics'",
//	                            "predicate": "{GET [/actuator/metrics], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/metrics"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'caches'",
//	                            "predicate": "{GET [/actuator/caches], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/caches"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'mappings'",
//	                            "predicate": "{GET [/actuator/mappings], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/mappings"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'loggers'",
//	                            "predicate": "{GET [/actuator/loggers], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/loggers"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator root web endpoint",
//	                            "predicate": "{GET [/actuator], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping.WebMvcLinksHandler",
//	                                    "name": "links",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Ljava/util/Map;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "Actuator web endpoint 'env-toMatch'",
//	                            "predicate": "{GET [/actuator/env/{toMatch}], produces [application/vnd.spring-boot.actuator.v3+json || application/vnd.spring-boot.actuator.v2+json || application/json]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping.OperationHandler",
//	                                    "name": "handle",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljava/util/Map;)Ljava/lang/Object;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/actuator/env/{toMatch}"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v3+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/vnd.spring-boot.actuator.v2+json",
//	                                            "negated": false
//	                                        },
//	                                        {
//	                                            "mediaType": "application/json",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#errorHtml(HttpServletRequest, HttpServletResponse)",
//	                            "predicate": "{ [/error], produces [text/html]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController",
//	                                    "name": "errorHtml",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Lorg/springframework/web/servlet/ModelAndView;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/error"
//	                                    ],
//	                                    "produces": [
//	                                        {
//	                                            "mediaType": "text/html",
//	                                            "negated": false
//	                                        }
//	                                    ]
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)",
//	                            "predicate": "{ [/error]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController",
//	                                    "name": "error",
//	                                    "descriptor": "(Ljavax/servlet/http/HttpServletRequest;)Lorg/springframework/http/ResponseEntity;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/error"
//	                                    ],
//	                                    "produces": []
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "com.demo.exmaple.controller.MyController#testEndPoint()",
//	                            "predicate": "{GET [/springactuator/test]}",
//	                            "details": {
//	                                "handlerMethod": {
//	                                    "className": "com.demo.exmaple.controller.MyController",
//	                                    "name": "testEndPoint",
//	                                    "descriptor": "()Ljava/lang/String;"
//	                                },
//	                                "requestMappingConditions": {
//	                                    "consumes": [],
//	                                    "headers": [],
//	                                    "methods": [
//	                                        "GET"
//	                                    ],
//	                                    "params": [],
//	                                    "patterns": [
//	                                        "/springactuator/test"
//	                                    ],
//	                                    "produces": []
//	                                }
//	                            }
//	                        },
//	                        {
//	                            "handler": "ResourceHttpRequestHandler [classpath [META-INF/resources/webjars/]]",
//	                            "predicate": "/webjars/**",
//	                            "details": null
//	                        },
//	                        {
//	                            "handler": "ResourceHttpRequestHandler [classpath [META-INF/resources/], classpath [resources/], classpath [static/], classpath [public/], ServletContext [/]]",
//	                            "predicate": "/**",
//	                            "details": null
//	                        }
//	                    ]
//	                },
//	                "servletFilters": [
//	                    {
//	                        "servletNameMappings": [],
//	                        "urlPatternMappings": [
//	                            "/*"
//	                        ],
//	                        "name": "webMvcMetricsFilter",
//	                        "className": "org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter"
//	                    },
//	                    {
//	                        "servletNameMappings": [],
//	                        "urlPatternMappings": [
//	                            "/*"
//	                        ],
//	                        "name": "requestContextFilter",
//	                        "className": "org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter"
//	                    },
//	                    {
//	                        "servletNameMappings": [],
//	                        "urlPatternMappings": [
//	                            "/*"
//	                        ],
//	                        "name": "Tomcat WebSocket (JSR356) Filter",
//	                        "className": "org.apache.tomcat.websocket.server.WsFilter"
//	                    },
//	                    {
//	                        "servletNameMappings": [],
//	                        "urlPatternMappings": [
//	                            "/*"
//	                        ],
//	                        "name": "characterEncodingFilter",
//	                        "className": "org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter"
//	                    },
//	                    {
//	                        "servletNameMappings": [],
//	                        "urlPatternMappings": [
//	                            "/*"
//	                        ],
//	                        "name": "formContentFilter",
//	                        "className": "org.springframework.boot.web.servlet.filter.OrderedFormContentFilter"
//	                    }
//	                ],
//	                "servlets": [
//	                    {
//	                        "mappings": [
//	                            "/"
//	                        ],
//	                        "name": "dispatcherServlet",
//	                        "className": "org.springframework.web.servlet.DispatcherServlet"
//	                    }
//	                ]
//	            },
//	            "parentId": null
//	        }
//	    }
//	}
}
